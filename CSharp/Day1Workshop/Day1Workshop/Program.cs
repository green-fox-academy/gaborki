using System;
using System.Collections.Generic;
using System.Linq;
using Day1Workshop.Properties;

namespace Day1Workshop
{
    internal class Program
    {   
        public static void Main(string[] args)
        {
            Exercise2 ex = new Exercise2();
            
//            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };  
//            
//            IEnumerable<int> evenNumbers = n.Where(y => y % 2 == 0);
//
//            foreach (int evenNumber in evenNumbers)
//            {
//                Console.WriteLine(evenNumber);
//            }
//            
            Console.WriteLine(ex.oddAverage());
        }
    }
}