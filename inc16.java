class inc16 {

    int ina16[] = new int[16];
    int inb16[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int result16[] = new int[16];

    void out(){

        add16 add161 = new add16();
        add161.ina16 = ina16;
        add161.inb16 = inb16;
        add161.out();
        result16 = add161.sum;
    }
}
