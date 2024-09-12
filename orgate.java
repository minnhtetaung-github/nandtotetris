public class orgate {

    int ina;
    int inb;
    int not1out;
    int not2out;
    int result;

    void out(){

        notgate notgate1 = new notgate();
        notgate1.ina = ina;
        notgate1.out();
        not1out = notgate1.result;

        notgate notgate2 = new notgate();
        notgate2.ina = inb;
        notgate2.out();
        not2out = notgate2.result;

        nandgate nandgate1 = new nandgate();
        nandgate1.ina = not1out;
        nandgate1.inb = not2out;
        nandgate1.out();
        result = nandgate1.result;


    }
}
