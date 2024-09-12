public class xorgate {

    int ina;
    int inb;
    int and1out;
    int or1out;
    int or2out;
    int not1out;
    int result;

    void out() {
        andgate andgate1 = new andgate();
        andgate1.ina = ina;
        andgate1.inb = inb;
        andgate1.out();
        and1out = andgate1.result;

        orgate orgate1 = new orgate();
        orgate1.ina = ina;
        orgate1.inb = inb;
        orgate1.out();
        or1out = orgate1.result;

        notgate notgate1 = new notgate();
        notgate1.ina = or1out;
        notgate1.out();
        not1out = notgate1.result;

        orgate orgate2 = new orgate();
        orgate2.ina = and1out;
        orgate2.inb = not1out;
        orgate2.out();
        or2out = orgate2.result;

        notgate notgate2 = new notgate();
        notgate2.ina = or2out;
        notgate2.out();
        result = notgate2.result;


    }

}
