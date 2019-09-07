using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 参数
{
    //引用类型方法
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 1, 2, 3 };
            AddOne(a);
            foreach(int k in a )
            Console.WriteLine(k);
        }
        static void AddOne(int[]a)
        {
            for(int i=0;i<a.Length;i++)
            {
                a[i]++;
            }
        }
    }
}
