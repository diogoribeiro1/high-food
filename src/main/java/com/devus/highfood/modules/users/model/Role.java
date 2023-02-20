package com.devus.highfood.modules.users.model;

public enum Role {
    
    USER("User"),
    ADMIN("Admin");

    private String descricao;

    Role(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
