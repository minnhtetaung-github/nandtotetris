class demux8 {

    int ina;
    int demux1out1;
    int demux1out2;

    int sel1;
    int sel2;
    int sel3;
    int sel4;

    int result[] = new int[8];

    void out(){

        demux demux1 = new demux();
        demux1.ina = ina;
        demux1.sel = sel1;
        demux1.out();
        demux1out1 = demux1.result1;
        demux1out2 = demux1.result2;

        demux4 demux41 = new demux4();
        demux41.ina = demux1out1;
        demux41.sel1 = sel2;
        demux41.sel2 = sel3;
        demux41.out();
        result[0] = demux41.result1;
        result[1] = demux41.result2;
        result[2] = demux41.result3;
        result[3] = demux41.result4;

        demux4 demux42 = new demux4();
        demux42.ina = demux1out2;
        demux42.sel1 = sel2;
        demux42.sel2 = sel3;
        demux42.out();
        result[4] = demux42.result1;
        result[5] = demux42.result2;
        result[6] = demux42.result3;
        result[7] = demux42.result4;

    }
}
