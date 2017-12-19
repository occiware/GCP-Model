package org.eclipse.cmf.occi.googlejson.handlers.json.data;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.StringType;
import org.eclipse.cmf.occi.googlejson.handlers.json.KindsBuilder;

public class StringToDataType {
	
	public final static StringType typeModelString = OCCIFactory.eINSTANCE.createStringType();
	public final static BooleanType typeModelBoolean = OCCIFactory.eINSTANCE.createBooleanType();
	public final static NumericType typeModelByte = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelDouble = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelFloat = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelInteger = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelLong = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelShort = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static EObjectType typeModelMap = OCCIFactory.eINSTANCE.createEObjectType();
	public final static ArrayType typeModelArray = OCCIFactory.eINSTANCE.createArrayType(); // TODO
	public final static EObjectType typeModelObject = OCCIFactory.eINSTANCE.createEObjectType();
	public final static Map<String, DataType> map = new HashMap<>();

	public static void initMap() {
		map.clear();
		map.put("string", typeModelString);
		map.put("boolean", typeModelBoolean);	
		map.put("byte", typeModelByte);
		map.put("double", typeModelDouble);
		map.put("float", typeModelFloat);
		map.put("integer", typeModelInteger);
		map.put("number", typeModelInteger);
		map.put("uint32", typeModelInteger);
		map.put("long", typeModelLong);
		map.put("short", typeModelShort);
		map.put("map", typeModelMap);
		map.put("array", typeModelArray);
		map.put("object", typeModelObject);
	}
	
	static {
		typeModelByte.setType(NumericTypeEnum.BYTE);
		typeModelByte.setName("byte");
		typeModelDouble.setType(NumericTypeEnum.DOUBLE);
		typeModelDouble.setName("double");
		typeModelFloat.setType(NumericTypeEnum.FLOAT);
		typeModelFloat.setName("float");
		typeModelInteger.setType(NumericTypeEnum.INTEGER);
		typeModelInteger.setName("integer");
		typeModelLong.setType(NumericTypeEnum.LONG);
		typeModelLong.setName("long");
		typeModelShort.setType(NumericTypeEnum.SHORT);
		typeModelShort.setName("short");
		typeModelBoolean.setName("boolean");
		typeModelString.setName("string");
		typeModelMap.setName("map");
		typeModelMap.setInstanceClassName("java.util.Map");
		typeModelArray.setName("array");
		typeModelArray.setType(typeModelObject);
		typeModelObject.setName("object");
		typeModelObject.setInstanceClassName("java.lang.Object");
		initMap();
	}
}
