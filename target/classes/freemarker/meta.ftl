public class ${meta.tableName} {
<#list meta.fields as javaField>
    private ${javaField.javaType} ${javaField.camelCaseName};
</#list>
<#list meta.fields as javaField>
    public ${javaField.javaType} get${javaField.camelCaseName}() {
        return ${javaField.camelCaseName};
    }
    public void set${javaField.camelCaseName}(${javaField.javaType} ${javaField.camelCaseName}) {
        this.${javaField.camelCaseName} = ${javaField.camelCaseName};
    }
</#list>
}