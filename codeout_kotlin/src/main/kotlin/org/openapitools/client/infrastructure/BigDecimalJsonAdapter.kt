package org.openapitools.client.infrastructure

import com.squareup.moshi.*
import java.math.BigDecimal

open class BigDecimalJsonAdapter: JsonAdapter<BigDecimal>()
{
    @FromJson
    override fun fromJson(reader: JsonReader): BigDecimal?
    {
        if (reader.peek() !== JsonReader.Token.NUMBER)
        {
            return null
        }

        return BigDecimal(reader.nextString())
    }

    @ToJson
    override fun toJson(writer: JsonWriter, value: BigDecimal?)
    {
        if (value != null)
        {
            if (!value.isIntValue)
            {
                writer.value(value.toDouble())
            }
            else
            {
                try
                {
                    writer.value(value.toInt())
                }
                catch (ex: ArithmeticException)
                {
                    writer.value(value.toLong())
                }
            }
        }
        else
        {
            writer.value(0)
        }
    }
}


val BigDecimal.isIntValue : Boolean
    get() = this.signum() == 0 || this.scale() <= 0 || this.stripTrailingZeros().scale() <= 0
