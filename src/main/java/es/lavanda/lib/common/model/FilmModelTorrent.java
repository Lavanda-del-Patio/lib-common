package es.lavanda.lib.common.model;

import lombok.Data;

@Data
@EqualsAndHashCode(callSuper = true)
public class FilmModelTorrent extends TorrentModel {

    private int torrentYear;

}
