package com.company.speedment.orm.test.hello;

import com.speedment.orm.runtime.ApplicationMetadata;

/**
 * A Speedment Application Metadata representing an entity (for example, a row) in the Project 'hello'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
public class HelloApplicationMetadata implements ApplicationMetadata {
    
    public HelloApplicationMetadata() {
        
    }
    
    @Override
    public String getMetadata() {
        return 
                "import com.speedment.orm.config.model.parameters.*\n"+
                "\n"+
                "name = \"hello\";\n"+
                "packetLocation = \"src/main/java\";\n"+
                "packetName = \"com.company.speedment.orm.test\";\n"+
                "enabled = true;\n"+
                "dbms {\n"+
                "    ipAddress = \"localhost\";\n"+
                "    name = \"db0\";\n"+
                "    password = \"\";\n"+
                "    port = 3306;\n"+
                "    type = StandardDbmsType.MYSQL;\n"+
                "    username = \"root\";\n"+
                "    enabled = true;\n"+
                "    schema {\n"+
                "        columnCompressionType = ColumnCompressionType.NONE;\n"+
                "        fieldStorageType = FieldStorageType.WRAPPER;\n"+
                "        name = \"hellospeedment\";\n"+
                "        schemaName = \"hellospeedment\";\n"+
                "        storageEngineType = StorageEngineType.ON_HEAP;\n"+
                "        defaultSchema = false;\n"+
                "        enabled = true;\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"image\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"image\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"title\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"description\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"author\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.sql.Timestamp.class;\n"+
                "                name = \"published\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"src\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "        }\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"transition\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"transition\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"from\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"to\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"from\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"to\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "        }\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"user\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"user\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"mail\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "        }\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"visit\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"visit\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.sql.Timestamp.class;\n"+
                "                name = \"time\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"user\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"image\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = true;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "        }\n"+
                "    }\n"+
                "}\n"+
        "";
    }
}