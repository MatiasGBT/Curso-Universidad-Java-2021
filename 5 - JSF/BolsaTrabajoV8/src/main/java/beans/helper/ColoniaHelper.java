package beans.helper;

import beans.model.Colonia;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@RequestScoped
@Named
public class ColoniaHelper {

    public List<Colonia> getColonias() {
        List<Colonia> colonias = new ArrayList<>();

        int coloniaId = 1;
        Colonia colonia = new Colonia(coloniaId++, "Nápoles", 3810); //Si se pone el 0 de primer número, Java lo toma como valor octal.
        colonias.add(colonia);

        colonia = new Colonia(coloniaId++, "Polanco", 11530);
        colonias.add(colonia);

        colonia = new Colonia(coloniaId++, "Del Valle Centro", 3100);
        colonias.add(colonia);

        return colonias;
    }

    public int getColoniaIdPorNombre(String nombre) {
        int coloniaId = 0;
        List<Colonia> colonias = getColonias();

        for (Colonia colonia : colonias) {
            if (colonia.getNombreColonia().equals(nombre)) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }

        return coloniaId;
    }

    public int getColoniaIdPorCodigoPostal(int codigoPostal) {
        int coloniaId = 0;
        List<Colonia> colonias = getColonias();

        for (Colonia colonia : colonias) {
            if (colonia.getCodigoPostal() == codigoPostal) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }

        return coloniaId;
    }
    
    //Método para convertir la lista en SelectItems
    public List<SelectItem> getSelectItems() {
        List<SelectItem> selectItems = new ArrayList<>();
        List<Colonia> colonias = getColonias();
        for (Colonia colonia : colonias) {
            //Primer valor es el id y el segundo el label, es decir, lo que visualizara el usuario
            SelectItem selectItem = new SelectItem(colonia.getColoniaId(), colonia.getNombreColonia());
            selectItems.add(selectItem);
        }
        return selectItems;
    }
}
