package com.entropy;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;

import java.util.logging.Logger;


public class WordCountSink implements SinkFunction<Tuple2<String,Integer>> {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger("WordCountSink");

    @Override
    public void invoke(Tuple2<String, Integer> value, Context context) throws Exception {
        logger.info("{ Word: \""+ value.f0 + "\", Cnt:" + value.f1 +"}");
    }
}


