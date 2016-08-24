public class ${tableName} {
<#list ${javaField}>
private ${javaField.type} ${javaField.name};
</#list>
<#list>
public ${javaField.type} get${javaField.upperFirstName}() {
return ${javaField.name};
}
public void set${javaField.upperFirstName}(${javaField.type} ${javaField.name}) {
this.${javaField.name} = ${javaField.name};
}
</#list>
}