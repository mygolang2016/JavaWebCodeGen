public class ${meta.tableName} {
<#list meta.fields as javaField>
    private ${javaField.javaType} ${javaField.camelCaseName?uncap_first};
</#list>
<#list meta.fields as javaField>
    public ${javaField.javaType} get${javaField.camelCaseName}() {
        return this.${javaField.camelCaseName?uncap_first};
    }
    public void set${javaField.camelCaseName}(${javaField.javaType} ${javaField.camelCaseName?uncap_first}) {
        this.${javaField.camelCaseName?uncap_first} = ${javaField.camelCaseName?uncap_first};
    }
</#list>
}