package es.lavanda.lib.common.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class FilebotExecutionODTO implements Serializable {

    private String id;

    private String label;

    private boolean forceStrict;

    private String query;

    private String selectedPossibilitie;

}
