class inc16 {

    static int ina16[] = new int[16];
    static int inb16[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
    static int result16[] = new int[16];

    static void out(){

        add16 add161 = new add16();
        add161.ina16 = ina16;
        add161.inb16 = inb16;
        add161.out();

        result16 = add161.sum;


    }


}
