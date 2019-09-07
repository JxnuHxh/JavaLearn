using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 计算器
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public char[] c=new char[10];
        public int i = 0;
        
        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button16_Click(object sender, EventArgs e)
        {
            
            textBox1.Text = textBox1.Text + "0";
            c[i] = '0';
            i++;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
            textBox1.Text =textBox1.Text+ "1";
            c[i] = '1';
            i++;
        }

        private void button8_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "6";
            c[i] = '6';
            i++;
        }

        private void button15_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text+"2";
            c[i] = '2';
            i++;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "3";
            c[i] = '3';
            i++;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "4";
             c[i] ='4';
            i++;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "5";
            c[i] ='5';
            i++;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text+"/";
            c[i] ='/';
            i++;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            for (int j = 0; j < i; j++)
                c[j] = '0';
        }

        private void button9_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "*";
            c[i] = '*';
            i++;
        }

        private void button11_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "7";
            c[i] = '7';
            i++;
        }

        private void button12_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "8";
            c[i] = '8';
            i++;
        }

        private void button13_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "9";
            c[i] = '9';
            i++;
        }

        private void button14_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "-";
            c[i] = '-';
            i++;
        }

        private void button19_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "+";
            c[i] = '+';
            i++;
        }
        public void Hx()
        {
            string b="",n="";
            char d='d' ;
            for (int j = 0; j < i; j++)
            {
                  if (d != 'd')
                {
                    n += c[j];
                   
                    continue;
                }      

                if (c[j] == '1' || c[j] == '2' || c[j] == '3' || c[j] == '0' ||
                    c[j] == '4' || c[j] == '5' || c[j] == '6' || c[j] == '7' ||
                    c[j] == '8' || c[j] == '9')
                    b += c[j];
                else if (c[j] == '+')
                    d = c[j];
                else if (c[j] == '-')
                    d = c[j];
                else if (c[j] == '*')
                    d = c[j];
                else if (c[j] == '/')
                    d = c[j];
            }
            int m=0;

            if (d == '+')
                m = int.Parse(n)+int.Parse(b);
            if (d == '-')
                m = Convert.ToInt32(b) - Convert.ToInt32(n);
            if (d == '*')
                m = Convert.ToInt32(n) * Convert.ToInt32(b);
            if (d == '/')
                m = Convert.ToInt32(b) / Convert.ToInt32(n);

            textBox1.Text += Convert.ToString(m);
        }

        private void button20_Click(object sender, EventArgs e)
        {
            textBox1.Text += "=";
            Hx();
        }
    }
}
