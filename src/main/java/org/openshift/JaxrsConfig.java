// JaxrsConfig.java ---
//
// Filename: JaxrsConfig.java
// Description:
// Author: Anupam Sengupta
// Maintainer:
// 2007-2018 Anupam Sengupta.// Created: Wed Jul  7 00:44:54 2021 (-0400)
// Version:
//

// Code:

package org.openshift;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class JaxrsConfig extends Application {
    // Noop.
}

//
// JaxrsConfig.java ends here
