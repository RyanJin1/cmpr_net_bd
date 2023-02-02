package com.jyc.cmpr_net_bd.client;

import com.jyc.cmpr_net_bd.thrift.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import java.util.ArrayList;
/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 15:09
 */
@Slf4j
public class PredictClient {
    private PredictService.Client predictService;
    private TBinaryProtocol protocol;
    private TSocket transport;
    private String host;
    private int port;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }

    public void init() {
        try {
            transport = new TSocket(host, port, 120000);
            protocol = new TBinaryProtocol(transport);
            predictService = new PredictService.Client(protocol);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PredictResponse predict(PredictRequest req) {
        try {
            open();
            return predictService.Predict(req);
        } catch (TException e) {
            e.printStackTrace();
            return new PredictResponse("0", new ArrayList<>());
        } finally {
            close();
        }
    }

    public GraphResponse getGraph(GraphRequset req) {
        try {
            open();
            return predictService.GetGraph(req);
        } catch (TException e) {
            e.printStackTrace();
            return new GraphResponse("1", new ArrayList<>(), new ArrayList<>());
        } finally {
            close();
        }
    }

    public GetClusterResponse getCluster(GetClusterRequest req) {
        try {
            open();
            return predictService.GetCluster(req);
        } catch (TException e) {
            e.printStackTrace();
            return new GetClusterResponse("1", new ArrayList<>(), new ArrayList<>());
        } finally {
            close();
        }
    }

    public EnrichmentResponse getEnrichment(EnrichmentRequest req) {
        try {
            open();
            return predictService.GetEnrichment(req);
        } catch (TException e) {
            e.printStackTrace();
            return new EnrichmentResponse("1", new ArrayList<>());
        } finally {
            close();
        }
    }

    public void open() throws TTransportException {
        transport.open();
    }

    public void close() {
        transport.close();
    }
}
