package udfexamples

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.Date

import org.apache.hadoop.hive.ql.exec.UDF

class FormatTimestamp extends UDF {

  def evaluate(t: Timestamp, fmt: String): String = {
    val formatter = new SimpleDateFormat(fmt)
    val result = formatter.format(new Date(t.getTime))
    result
  }
}
