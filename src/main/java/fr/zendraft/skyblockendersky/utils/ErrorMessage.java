package fr.zendraft.skyblockendersky.utils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ErrorMessage {
    ArgumentNotValid(Chat.error("Cet argument n'existe pas."));

    public final String message;
}
