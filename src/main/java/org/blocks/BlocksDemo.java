package org.blocks;

public class BlocksDemo {
        static {
            System.out.println("We are inside Static Block1");
        }
        {
            System.out.println("We are inside Non-Static Block1");
        }
        static {
            System.out.println("We are inside Static Block2");
        }
        {
            System.out.println("We are inside Non-Static Block2");
        }


        public static void main(String[] args) {
            System.out.println("------------------------------------------");
            System.out.println("We Are Inside Main Method");
            System.out.println("------------------------------------------");

            new BlocksDemo();
            new BlocksDemo();

        }
    }


