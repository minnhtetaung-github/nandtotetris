class demux4 {

    int ina;
    int sel1;
    int sel2;
    int demux1out;
    int demux2out;

    int result1;
    int result2;
    int result3;
    int result4;

    void out(){

        demux demux1 = new demux();
        demux1.ina = ina;
        demux1.sel = sel1;
        demux1.out();
        demux1out = demux1.result1;
        demux2out = demux1.result2;

        demux demux2 = new demux();
        demux2.ina = demux1out;
        demux2.sel = sel2;
        demux2.out();
        result1 = demux2.result1;
        result2 = demux2.result2;

        demux demux3 = new demux();
        demux3.ina = demux2out;
        demux3.sel = sel2;
        demux3.out();
        result3 = demux3.result1;
        result4 = demux3.result2;

    }
}
