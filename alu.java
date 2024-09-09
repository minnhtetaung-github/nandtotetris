import java.util.Arrays;

class alu{

    static int ina16[] = new int[16];
    static int inb16[] = new int[16];
    static int sz16[]  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    static int result16[] = new int[16];

    static int func16[] = new int[6];

    static int mux161out[] = new int[16]; /* xMUX */
    static int mux162out[] = new int[16]; /* yMUX */
    static int mux163out[] = new int[16]; /* ReadyX */
    static int mux164out[] = new int[16]; /* ReadyY */
    static int mux165out[] = new int[16]; /* Result */

    static int not161out[] = new int[16]; /* notX */
    static int not162out[] = new int[16]; /* notY */
    static int not163out[] = new int[16]; /* fNotout */

    static int and161out[] = new int[16];

    static int add161out[] = new int[16];

    static int i;

    static int xMux[] = new int[16];

    static void out(){

        mux16 mux161 = new mux16();
        mux161.ina16 = ina16;
        mux161.inb16 = sz16;
        mux161.sel   = func16[0];
        mux161.out();
        mux161out = mux161.result16;

        System.out.println("zx" + func16[0]);
        for(int i = 0; i < 16; i++){
            System.out.print(mux161out[i]);
        }

        mux16 mux162 = new mux16();
        mux162.ina16 = inb16;
        mux162.inb16 = sz16;
        mux162.sel   = func16[2];
        mux162.out();
        mux162out = mux162.result16;

        System.out.println("\nzy" + func16[2]);
        for(int i = 0; i < 16; i++){
            System.out.print(mux162out[i]);
        }

        if(Arrays.equals(mux161out, mux162out)){
            System.out.println("wtf");
        }
        else{
            System.out.println("not bad");
        }

        not16 not161 = new not16();
        not161.in16 = mux161out;
        not161.out();
        not161out = not161.result16;

        mux16 mux163 = new mux16();
        mux163.ina16 = mux161out;
        mux163.inb16 = not161out;
        mux163.sel   = func16[1];
        mux163.out();
        mux163out = mux163.result16;

        System.out.println("\nnx" + func16[1]);
        for(int i = 0; i < 16; i++){
            System.out.print(mux163out[i]);
        }

        not16 not162 = new not16();
        not162.in16  = mux162out;
        not162.out();
        not162out = not162.result16;

        mux16 mux164 = new mux16();
        mux164.ina16 = mux162out;
        mux164.inb16 = not162out;
        mux164.sel   = func16[3];
        mux164.out();
        mux164out = mux164.result16;

        System.out.println("\nny" + func16[3]);
        for(int i = 0; i < 16; i++){
            System.out.print(mux164out[i]);
        }


        and16 and161 = new and16();
        and161.ina16 = mux163out;
        and161.inb16 = mux164out;
        and161.out();
        and161out  = and161.result16;

        add16 add161 = new add16();
        add161.ina16 = mux163out;
        add161.inb16 = mux164out;
        add161.out();
        add161out  = add161.result16;

        mux16 mux165 = new mux16();
        mux165.ina16 = and161out;
        mux165.inb16 = add161out;
        mux165.sel   = func16[4];
        mux165.out();
        mux165out = mux165.result16;

        not16 not163 = new not16();
        not163.in16 = mux165out;
        not163.out();
        not163out = not163.result16;

        mux16 mux166 = new mux16();
        mux166.ina16 = mux165out;
        mux166.inb16 = not163out;
        mux166.sel   = func16[5];
        result16 = mux166.result16;


    }

}


