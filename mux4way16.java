class mux4way16 {

    static int ina16[] = new int[16];
    static int inb16[] = new int[16];
    static int inc16[] = new int[16];
    static int ind16[] = new int[16];
    static int result16[] = new int[16];
    static int sel1;
    static int sel2;
    static int sel3;

    static int[] out1 = new int[16];
    static int[] out2 = new int[16];

    static void out(){

        mux16 mux164 = new mux16();
        mux164.ina16 = ina16;
        mux164.inb16 = inb16;
        mux164.sel = sel2;
        out1 = mux164.out();

        mux mux1 = new mux();
        for (int i = 0; i <16; i++){
            mux1.ina = inc16[i];
            mux1.inb = ind16[i];
            mux1.sel = sel2;
            out2[i] = mux1.out();
        }

        mux16 mux163 = new mux16();
        mux163.ina16 = out1;
        mux163.inb16 = out2;
        mux163.sel = sel1;
        result16 = mux163.out();


    }

}