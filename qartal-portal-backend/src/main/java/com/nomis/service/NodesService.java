package com.nomis.service;

import com.nomis.dto.NodeDto;

/**
 * @author Artur Kushner
 * @since 4/17/18
 */
public interface NodesService {

  long addNode(NodeDto node);

  void removeNodeById(long id);

  NodeDto getNodeById(long id);

  NodeDto getNodeByNodeType(String nodeType);

}
