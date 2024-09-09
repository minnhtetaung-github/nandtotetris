
class and16{

    static int ina16[] = new int[16];
    static int inb16[] = new int[16];
    static int result16[] = new int[16];

    static void out(){

        for(int i = 0; i < 16; i++){

            andgate andgate1 = new andgate();
            andgate1.ina = ina16[i];
            andgate1.inb = inb16[i];
            result16[i] = andgate1.out();

            

        }
    }
}