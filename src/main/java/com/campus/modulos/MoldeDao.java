package com.campus.modulos;
import java.lang.reflect.Type;
import java.util.List;

import com.campus.modulos.CrudJSON.ManejoDeDAO;
import com.google.gson.reflect.TypeToken;

public class MoldeDao extends ManejoDeDAO<Molde> {
    public MoldeDao(){
        super("Molde.json", new TypeToken<List<Molde>>() {}.getType());
    }

    @Override
    protected int getId(Molde molde) {
        return molde.getId();
    }
    
}
