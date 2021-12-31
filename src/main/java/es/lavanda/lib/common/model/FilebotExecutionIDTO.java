package es.lavanda.lib.common.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class FilebotExecutionIDTO implements Serializable {

    private String id;

    private List<String> files;

    private String path;

}
