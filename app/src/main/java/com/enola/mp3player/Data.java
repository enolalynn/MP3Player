package com.enola.mp3player;

import java.io.Serializable;

public record Data (
        String artistName,
        Integer artistPhoto,
        Integer artistSong
) implements Serializable {
}
