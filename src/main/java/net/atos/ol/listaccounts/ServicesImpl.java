package net.atos.ol.listaccounts;

import java.util.Date;
import java.util.HashMap;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@ApplicationPath("/")
public class ServicesImpl extends Application implements Services {

    private TestData testData = new TestData();



    @Override
    public Response listAccounts(@Context HttpHeaders headers, @PathParam("param") String param) {
        String customer = param;
        return Response.ok(testData.getData(customer)).build();
    }


}
