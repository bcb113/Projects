using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Enigma_Machine_GUI
{
    public partial class Form1 : Form
    {
        private int key;

        public Form1()
        {
            InitializeComponent();
        }
        public int getKey()
        {
            return key;
        }
        public void setKey(int key)
        {
            this.key = key;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(!textBox1.Text.Equals("")){ //if phrase box isn't empty
                if(!textBox2.Text.Equals("")){ //if result box isn't empty
                    textBox2.Clear();
                }

                char[] message = encode(textBox1.Text);
                string msg = "";

                //converting message array to String
                foreach(char c in message){
                    msg += c;
                }

                //display
                textBox2.Text += msg;
                textBox1.Clear();
                MessageBox.Show("Your decryption key is: " + getKey());
                textBox3.Clear();
                textBox3.Text += getKey();
            }
            else{
                MessageBox.Show("Please enter a message to encrypt!");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if(textBox1.Text.Equals("")){ //if phrase box is empty
                MessageBox.Show("Please enter an encrypted message to decrypt!");
            }else if(!textBox3.Text.Equals("")){
                if (!textBox2.Text.Equals("")){
                    textBox2.Clear();
                }
                char[] message = decode(textBox1.Text, Int32.Parse(textBox3.Text));
                string msg = "";

                foreach(char c in message){
                    msg += c;
                }
                textBox2.Text += msg;
                textBox1.Clear();
            }else{
                MessageBox.Show("Please enter a decryption key!");
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private char[] encode(String message)
        {
            Random rand = new Random();
            setKey(rand.Next(99) + 1);

            char[] messageArray = new char[message.Length];

            for(int x = 0; x < message.Length; x++){
                messageArray[x] = message[x];
            }

            encryptMessage(messageArray, key);

            return messageArray;
        }

        private char[] decode(String message, int key)
        {
            char[] messageArray = new char[message.Length];

            for (int x = 0; x < message.Length; x++){
                messageArray[x] = message[x];
            }

            decryptMessage(messageArray, key);

            return messageArray;
        }

        // implementing Fisher–Yates shuffling using a seed
        private static void encryptMessage(char[] array, int seed)
        {
            Random rand = new Random(seed);
            for (int i = array.Length - 1; i > 0; i--){
                int index = rand.Next(i + 1);

                char temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }

        private static void decryptMessage(char[] array, int seed)
        {
            Random rand = new Random(seed);
            int[] randoms = new int[array.Length - 1];
            int j = 0;

            for (int i = array.Length - 1; i > 0; i--){
                randoms[j++] = rand.Next(i + 1);
            }
            //deShuffling
            for (int i = 1; i < array.Length; i++){
                //use the random values backwards
                int index = randoms[array.Length - i - 1];

                char temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //Close application
            Application.Exit();
        }
    }
}
