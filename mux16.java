class mux16 {

    static int ina16[] = new int[16];
    static int inb16[] = new int[16];
    static int result16[] = new int[16];
    static int sel;

    static void out(){

        mux mux1 = new mux();
        mux1.ina = ina16[0];
        mux1.inb = inb16[0];
        mux1.sel = sel;
        result16[0] = mux1.out();

        mux mux2 = new mux();
        mux2.ina = ina16[1];
        mux2.inb = inb16[1];
        mux2.sel = sel;
        result16[1] = mux2.out();

        mux mux3 = new mux();
        mux3.ina = ina16[2];
        mux3.inb = inb16[2];
        mux3.sel = sel;
        result16[2] = mux3.out();

        mux mux4 = new mux();
        mux4.ina = ina16[3];
        mux4.inb = inb16[3];
        mux4.sel = sel;
        result16[3] = mux4.out();

        mux mux5 = new mux();
        mux5.ina = ina16[4];
        mux5.inb = inb16[4];
        mux5.sel = sel;
        result16[4] = mux5.out();

        mux mux6 = new mux();
        mux6.ina = ina16[5];
        mux6.inb = inb16[5];
        mux6.sel = sel;
        result16[5] = mux6.out();

        mux mux7 = new mux();
        mux7.ina = ina16[6];
        mux7.inb = inb16[6];
        mux7.sel = sel;
        result16[6] = mux7.out();

        mux mux8 = new mux();
        mux8.ina = ina16[7];
        mux8.inb = inb16[7];
        mux8.sel = sel;
        result16[7] = mux8.out();

        mux mux9 = new mux();
        mux9.ina = ina16[8];
        mux9.inb = inb16[8];
        mux9.sel = sel;
        result16[8] = mux9.out();

        mux mux10 = new mux();
        mux10.ina = ina16[9];
        mux10.inb = inb16[9];
        mux10.sel = sel;
        result16[9] = mux10.out();

        mux mux11 = new mux();
        mux11.ina = ina16[10];
        mux11.inb = inb16[10];
        mux11.sel = sel;
        result16[10] = mux11.out();

        mux mux12 = new mux();
        mux12.ina = ina16[11];
        mux12.inb = inb16[11];
        mux12.sel = sel;
        result16[11] = mux12.out();

        mux mux13 = new mux();
        mux13.ina = ina16[12];
        mux13.inb = inb16[12];
        mux13.sel = sel;
        result16[12] = mux13.out();

        mux mux14 = new mux();
        mux14.ina = ina16[13];
        mux14.inb = inb16[13];
        mux14.sel = sel;
        result16[13] = mux14.out();

        mux mux15 = new mux();
        mux15.ina = ina16[14];
        mux15.inb = inb16[14];
        mux15.sel = sel;
        result16[14] = mux15.out();

        mux mux16 = new mux();
        mux16.ina = ina16[15];
        mux16.inb = inb16[15];
        mux16.sel = sel;
        result16[15] = mux16.out();




    }

}