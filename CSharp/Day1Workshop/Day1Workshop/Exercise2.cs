using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace Day1Workshop.Properties
{
    public class Exercise2
    {
        int[] numbers = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

        public double oddAverage()
        {
            return numbers.Where(y => y % 2 == 1).Average();
        } 
        
    }
}