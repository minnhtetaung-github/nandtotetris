class alu {

    int ina16[] = new int[16];
    int inb16[] = new int[16];
    int sz16[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    int result16[] = new int[16];

    int func6[] = new int[6];

    int mux161out[] = new int[16];
    int mux162out[] = new int[16];
    int mux163out[] = new int[16];
    int mux164out[] = new int[16];
    int mux165out[] = new int[16];

    int not161out[] = new int[16];
    int not162out[] = new int[16];
    int not163out[] = new int[16];

    int and161out[] = new int[16];
    int add161out[] = new int[16];

    int i;

    void out(){

        mux16 mux161 = new mux16();
        mux161.ina16 = ina16;
        mux161.inb16 = sz16;
        mux161.sel = func6[0];
        mux161.out();
        mux161out = mux161.result16;

        mux16 mux162 = new mux16();
        mux162.ina16 = inb16;
        mux162.inb16 = sz16;
        mux162.sel = func6[2];
        mux162.out();
        mux162out = mux162.result16;

        not16 not161 = new not16();
        not161.ina16 = mux161out;
        not161.out();
        not161out = not161.result16;

        mux16 mux163 = new mux16();
        mux163.ina16 = not161out;
        mux163.inb16 = not161out;
        mux163.sel = func6[1];
        mux163.out();
        mux163out = mux163.result16;

        not16 not162 = new not16();
        not162.ina16 = mux162out;
        not162.out();
        not162out = not162.result16;

        mux16 mux164 = new mux16();
        mux164.ina16 = mux162out;
        mux164.inb16 = not162out;
        mux164.sel = func6[3];
        mux164.out();
        mux164out = mux164.result16;

        and16 and161 = new and16();
        and161.ina16 = mux163out;
        and161.inb16 = mux164out;
        and161.out();
        and161out = and161.result16;

        add16 add161 = new add16();
        add161.ina16 = mux163out;
        add161.inb16 = mux164out;
        add161.out();
        add161out = add161.result16;

        mux16 mux165 = new mux16();
        mux165.ina16 = and161out;
        mux165.inb16 = add161out;
        mux165.sel = func6[4];
        mux165.out();
        mux165out = mux165.result16;

        not16 not163 = new not16();
        not163.ina16 = mux165out;
        not163.out();
        not163out = not163.result16;

        mux16 mux166 = new mux16();
        mux166.ina16 = mux165out;
        mux166.inb16 = not163out;
        mux166.sel = func6[5];
        mux166.out();
        result16 = mux166.result16;

    }


}
