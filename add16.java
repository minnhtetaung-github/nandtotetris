class add16 {

    int ina16[] = new int[16];
    int inb16[] = new int[16];

    int sum[] = new int[16];
    int carry[] = new int[16];

    int result16[] = new int[16];

    void out(){

        fulladder fulladder1 = new fulladder();
        fulladder1.ina = ina16[15];
        fulladder1.inb = inb16[15];
        fulladder1.inc = 0;
        fulladder1.out();
        sum[15] = fulladder1.sum;
        carry[15] = fulladder1.carry;

        fulladder fulladder2 = new fulladder();
        fulladder2.ina = ina16[14];
        fulladder2.inb = inb16[14];
        fulladder2.inc = carry[15];
        fulladder2.out();
        sum[14] = fulladder2.sum;
        carry[14] = fulladder2.carry;

        fulladder fulladder3 = new fulladder();
        fulladder3.ina = ina16[13];
        fulladder3.inb = inb16[13];
        fulladder3.inc = carry[14];
        fulladder3.out();
        sum[13] = fulladder3.sum;
        carry[13] = fulladder3.carry;

        fulladder fulladder4 = new fulladder();
        fulladder4.ina = ina16[12];
        fulladder4.inb = inb16[12];
        fulladder4.inc = carry[13];
        fulladder4.out();
        sum[12] = fulladder4.sum;
        carry[12] = fulladder4.carry;

        fulladder fulladder5 = new fulladder();
        fulladder5.ina = ina16[11];
        fulladder5.inb = inb16[11];
        fulladder5.inc = carry[12];
        fulladder5.out();
        sum[11] = fulladder5.sum;
        carry[11] = fulladder5.carry;

        fulladder fulladder6 = new fulladder();
        fulladder6.ina = ina16[10];
        fulladder6.inb = inb16[10];
        fulladder6.inc = carry[11];
        fulladder6.out();
        sum[10] = fulladder6.sum;
        carry[10] = fulladder6.carry;

        fulladder fulladder7 = new fulladder();
        fulladder7.ina = ina16[9];
        fulladder7.inb = inb16[9];
        fulladder7.inc = carry[10];
        fulladder7.out();
        sum[9] = fulladder7.sum;
        carry[9] = fulladder7.carry;

        fulladder fulladder8 = new fulladder();
        fulladder8.ina = ina16[8];
        fulladder8.inb = inb16[8];
        fulladder8.inc = carry[9];
        fulladder8.out();
        sum[8] = fulladder8.sum;
        carry[8] = fulladder8.carry;

        fulladder fulladder9 = new fulladder();
        fulladder9.ina = ina16[7];
        fulladder9.inb = inb16[7];
        fulladder9.inc = carry[8];
        fulladder9.out();
        sum[7] = fulladder9.sum;
        carry[7] = fulladder9.carry;

        fulladder fulladder10 = new fulladder();
        fulladder10.ina = ina16[6];
        fulladder10.inb = inb16[6];
        fulladder10.inc = carry[7];
        fulladder10.out();
        sum[6] = fulladder10.sum;
        carry[6] = fulladder10.carry;

        fulladder fulladder11 = new fulladder();
        fulladder11.ina = ina16[5];
        fulladder11.inb = inb16[5];
        fulladder11.inc = carry[6];
        fulladder11.out();
        sum[5] = fulladder11.sum;
        carry[5] = fulladder11.carry;

        fulladder fulladder12 = new fulladder();
        fulladder12.ina = ina16[4];
        fulladder12.inb = inb16[4];
        fulladder12.inc = carry[5];
        fulladder12.out();
        sum[4] = fulladder12.sum;
        carry[4] = fulladder12.carry;

        fulladder fulladder13 = new fulladder();
        fulladder13.ina = ina16[3];
        fulladder13.inb = inb16[3];
        fulladder13.inc = carry[4];
        fulladder13.out();
        sum[3] = fulladder13.sum;
        carry[3] = fulladder13.carry;

        fulladder fulladder14 = new fulladder();
        fulladder14.ina = ina16[2];
        fulladder14.inb = inb16[2];
        fulladder14.inc = carry[3];
        fulladder14.out();
        sum[2] = fulladder14.sum;
        carry[2] = fulladder14.carry;

        fulladder fulladder15 = new fulladder();
        fulladder15.ina = ina16[1];
        fulladder15.inb = inb16[1];
        fulladder15.inc = carry[2];
        fulladder15.out();
        sum[1] = fulladder15.sum;
        carry[1] = fulladder15.carry;

        fulladder fulladder16 = new fulladder();
        fulladder16.ina = ina16[0];
        fulladder16.inb = inb16[0];
        fulladder16.inc = carry[1];
        fulladder16.out();
        sum[0] = fulladder16.sum;
        carry[0] = fulladder16.carry;






    }
}
