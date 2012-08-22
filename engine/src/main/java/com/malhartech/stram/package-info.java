/**
 * Copyright (c) 2012-2012 Malhar, Inc.
 * All rights reserved.
 * 
 */

/** 
 * <b>com.malhartech.stram</b> package contains all code for streaming application master<p>
 * <br>
 * The application master is also called <b>STRAM</b><br>
 * (TBD - To explain all functionality)<br>
 * <br>
 * <b>AdapterWrapperNode</b>: Wrapper node to connects adapter "stream" to another source or sink stream<br>
 * <b>DNodeManager</b>: Tracks topology provisioning/allocation to containers<br>
 * <b>LaunchContainerRunnable</b>: Runnable to connect to the {@link ContainerManager} and launch the container that will host streaming nodes<br>
 * <b>NodePConf</b>: TBD (Stram side implementation of Physcial Node?)<br>
 * <b>StramAppContext</b>: Context interface for sharing information across components in YARN App<br>
 * <b>StramAppMaster</b>: Streaming Application Master (see {@link org.apache.hadoop.yarn.applications.distributedshell.ApplicationMaster})<br>
 * <b>StramChild</b>: The main() for streaming node processes launched by {@link com.malhartech.stram.StramAppMaster}<br>
 * <b>StramChildAgent</b>: Representation of a child container in the master<br>
 * <b>StramClient</b>: Submits application to YARN<br>
 * <b>StramConstants</b>: Placeholder for constants to be used by Stram/Dag<br>
 * <b>StramUtils</b>: Utilities for shared use in Stram components<br>
 * <b>StreamPConf</b>: Definition of stream connecting 2 nodes either inline or via buffer server<br>
 * <b>StreamingNodeParent</b>: Stram side implementation of communication protocol with hadoop container<br>
 * <b>StreamingNodeUmbilicalProtocol</b>: Classes and code for communication protocol between streaming node child process and stram<br>
 * <b>TopologyGenerator</b>: Classes and code that derives the physical model from the logical dag and assigned to hadoop container. Is the initial query planner<br>
 * <b>WindowGenerator</b>: Runs in the hadoop container of the input adapters and generates windows<br>
 * <br>  
 * 
 */

package com.malhartech.stram;
