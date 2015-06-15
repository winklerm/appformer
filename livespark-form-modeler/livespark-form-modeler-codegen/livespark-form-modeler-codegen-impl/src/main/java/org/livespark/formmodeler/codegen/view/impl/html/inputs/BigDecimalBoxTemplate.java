package org.livespark.formmodeler.codegen.view.impl.html.inputs;

import org.livespark.formmodeler.model.impl.BigDecimalBoxFieldDefinition;

/**
 * Created by pefernan on 4/29/15.
 */
public class BigDecimalBoxTemplate extends AbstractInputTemplateProvider {

    @Override
    public String getSupportedFieldType() {
        return BigDecimalBoxFieldDefinition.class.getName();
    }
}