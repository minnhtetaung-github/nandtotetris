class mux16 {

    int ina16[] = new int[16];
    int inb16[] = new int[16];
    int result16[] = new int[16];
    int sel;

    void out(){

        mux mux1 = new mux();
        mux1.ina = ina16[0];
        mux1.inb = inb16[0];
        mux1.sel = sel;
        mux1.out();
        result16[0] = mux1.result;

        mux mux2 = new mux();
        mux2.ina = ina16[1];
        mux2.inb = inb16[1];
        mux2.sel = sel;
        mux2.out();
        result16[1] = mux2.result;

        mux mux3 = new mux();
        mux3.ina = ina16[2];
        mux3.inb = inb16[2];
        mux3.sel = sel;
        mux3.out();
        result16[2] = mux3.result;

        mux mux4 = new mux();
        mux4.ina = ina16[3];
        mux4.inb = inb16[3];
        mux4.sel = sel;
        mux4.out();
        result16[3] = mux4.result;

        mux mux5 = new mux();
        mux5.ina = ina16[4];
        mux5.inb = inb16[4];
        mux5.sel = sel;
        mux5.out();
        result16[4] = mux5.result;

        mux mux6 = new mux();
        mux6.ina = ina16[5];
        mux6.inb = inb16[5];
        mux6.sel = sel;
        mux6.out();
        result16[5] = mux6.result;

        mux mux7 = new mux();
        mux7.ina = ina16[6];
        mux7.inb = inb16[6];
        mux7.sel = sel;
        mux7.out();
        result16[6] = mux7.result;

        mux mux8 = new mux();
        mux8.ina = ina16[7];
        mux8.inb = inb16[7];
        mux8.sel = sel;
        mux8.out();
        result16[7] = mux8.result;

        mux mux9 = new mux();
        mux9.ina = ina16[8];
        mux9.inb = inb16[8];
        mux9.sel = sel;
        mux9.out();
        result16[8] = mux9.result;

        mux mux10 = new mux();
        mux10.ina = ina16[9];
        mux10.inb = inb16[9];
        mux10.sel = sel;
        mux10.out();
        result16[9] = mux10.result;

        mux mux11 = new mux();
        mux11.ina = ina16[10];
        mux11.inb = inb16[10];
        mux11.sel = sel;
        mux11.out();
        result16[10] = mux11.result;

        mux mux12 = new mux();
        mux12.ina = ina16[11];
        mux12.inb = inb16[11];
        mux12.sel = sel;
        mux12.out();
        result16[11] = mux12.result;

        mux mux13 = new mux();
        mux13.ina = ina16[12];
        mux13.inb = inb16[12];
        mux13.sel = sel;
        mux13.out();
        result16[12] = mux13.result;

        mux mux14 = new mux();
        mux14.ina = ina16[13];
        mux14.inb = inb16[13];
        mux14.sel = sel;
        mux14.out();
        result16[13] = mux14.result;

        mux mux15 = new mux();
        mux15.ina = ina16[14];
        mux15.inb = inb16[14];
        mux15.sel = sel;
        mux15.out();
        result16[14] = mux15.result;

        mux mux16 = new mux();
        mux16.ina = ina16[15];
        mux16.inb = inb16[15];
        mux16.sel = sel;
        mux16.out();
        result16[15] = mux16.result;



    }
}
