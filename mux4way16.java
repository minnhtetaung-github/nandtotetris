class mux4way16 {

    int ina16[] = new int[16];
    int inb16[] = new int[16];
    int inc16[] = new int[16];
    int ind16[] = new int[16];
    int result16[] = new int[16];
    int sel1;
    int sel2;

    int out1[] = new int[16];
    int out2[] = new int[16];

    void out(){

        mux16 mux161 = new mux16();
        mux161.ina16 = ina16;
        mux161.inb16 = inb16;
        mux161.sel = sel2;
        mux161.out();
        out1 = mux161.result16;;

        mux16 mux162 = new mux16();
        mux162.ina16 = inc16;
        mux162.inb16 = ind16;
        mux162.sel = sel2;
        mux162.out();
        out2 = mux162.result16;

        mux16 mux163 = new mux16();
        mux163.ina16 = out1;
        mux163.inb16 = out2;
        mux163.sel = sel1;
        mux163.out();
        result16 = mux163.result16;

    }
}
