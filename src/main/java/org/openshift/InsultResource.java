// InsultResource.java ---
//
// Filename: InsultResource.java
// Description:
// Author: Anupam Sengupta
// Maintainer:
// 2007-2018 Anupam Sengupta.// Created: Wed Jul  7 00:46:10 2021 (-0400)
// Version:
// Code:

package org.openshift;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped; import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped @Path("/insult")
public class InsultResource {

    @GET()
    @Produces("application/json")
    public HashMap<String,String> getInsult() {
        HashMap<String, String> theInsult = new HashMap<String, String>();
        theInsult.put("insult", new InsultGenerator().generateInsult());
        return theInsult;
    }
}

//
// InsultResource.java ends here
