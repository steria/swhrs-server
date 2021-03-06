package no.steria.swhrs.validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 28.09.12
 * Time: 12:27
 * All rights reserved Steria AS 2012
 *
 * @author chrm@steria.no
 */
public class GetFavoritesValidator extends Validator {

    private static final List<String> mandatoryFields = new ArrayList<String>();
    private static final List<String> optionalFields = new ArrayList<String>();

    static {
    }

    public List<String> getMandatoryFields() {
        return mandatoryFields;
    }

    public List<String> getOptionalFields() {
        return optionalFields;
    }
}
