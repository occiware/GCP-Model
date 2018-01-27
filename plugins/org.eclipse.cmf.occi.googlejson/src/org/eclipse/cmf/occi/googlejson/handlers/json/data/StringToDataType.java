package org.eclipse.cmf.occi.googlejson.handlers.json.data;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.StringType;
import org.eclipse.cmf.occi.googlejson.handlers.Main;

public class StringToDataType {
	
	public final static NumericType typeModelByte = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelDouble = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelFloat = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelLong = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelShort = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static EObjectType typeModelMap = OCCIFactory.eINSTANCE.createEObjectType();
	public final static ArrayType typeModelArray = OCCIFactory.eINSTANCE.createArrayType(); // TODO
	public final static EObjectType typeModelObject = OCCIFactory.eINSTANCE.createEObjectType();
	public final static EObjectType typeModelAny = OCCIFactory.eINSTANCE.createEObjectType();
	public final static Map<String, DataType> map = new HashMap<>();

	public static void initMap() {
		map.clear();
		for (DataType type : Main.coreExtensionTypes) {
			if (type.getName().equals("String")) {
				StringToDataType.map.put("string", type);	
			} else if (type.getName().equals("Boolean")) {
				StringToDataType.map.put("boolean", type);
			} else if (type.getName().equals("Integer")) {
				StringToDataType.map.put("integer", type);
				StringToDataType.map.put("number", type);
				StringToDataType.map.put("uint32", type);
			}
		}
		map.put("byte", typeModelByte);
		map.put("double", typeModelDouble);
		map.put("float", typeModelFloat);
		map.put("long", typeModelLong);
		map.put("short", typeModelShort);
		map.put("map", typeModelMap);
		map.put("array", typeModelArray);
		map.put("object", typeModelObject);
		map.put("any", typeModelAny);
	}
	
	static {
		typeModelByte.setType(NumericTypeEnum.BYTE);
		typeModelByte.setName("byte");
		typeModelDouble.setType(NumericTypeEnum.DOUBLE);
		typeModelDouble.setName("double");
		typeModelFloat.setType(NumericTypeEnum.FLOAT);
		typeModelFloat.setName("float");
		typeModelLong.setType(NumericTypeEnum.LONG);
		typeModelLong.setName("long");
		typeModelShort.setType(NumericTypeEnum.SHORT);
		typeModelShort.setName("short");
		typeModelMap.setName("map");
		typeModelMap.setInstanceClassName("java.util.Map");
		typeModelArray.setName("array");
		typeModelArray.setType(typeModelObject);
		typeModelObject.setName("object");
		typeModelObject.setInstanceClassName("java.lang.Object");
		typeModelAny.setName("any");
		typeModelAny.setInstanceClassName("java.lang.Object");
		initMap();
	}
}
