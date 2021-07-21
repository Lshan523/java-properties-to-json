package pl.jalokim.propertiestojson.object;

import pl.jalokim.propertiestojson.resolvers.PrimitiveJsonTypesResolver;
import pl.jalokim.propertiestojson.resolvers.primitives.object.ObjectToJsonTypeConverter;
import pl.jalokim.propertiestojson.resolvers.primitives.string.TextToConcreteObjectResolver;

/**
 * This is object for notify that given reference will be converted as null in json. It can be returned by {@link
 * ObjectToJsonTypeConverter#convertToJsonTypeOrEmpty(PrimitiveJsonTypesResolver, Object, String)} and can be returned by {@link
 * TextToConcreteObjectResolver#returnObjectWhenCanBeResolved(PrimitiveJsonTypesResolver, String, String)}
 */
@SuppressWarnings("PMD.UnusedImports")
public final class JsonNullReferenceType extends AbstractJsonType {

    public static final JsonNullReferenceType NULL_OBJECT = new JsonNullReferenceType();

    public static final String NULL_VALUE = "null";

    @Override
    public String toStringJson() {
        return NULL_VALUE;
    }
}
