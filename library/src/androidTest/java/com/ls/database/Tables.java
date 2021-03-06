/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Lemberg Solutions
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.ls.database;

/**
 * @author Stanislav Bodnar, Lemberg Solutions
 */
public class Tables {

    public static class DataTypes {
        public static final String NAME = "data_types";

        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_STRING = "string_value";
        public static final String COLUMN_BYTE = "byte_value";
        public static final String COLUMN_SHORT = "short_value";
        public static final String COLUMN_INTEGER = "integer_value";
        public static final String COLUMN_LONG = "long_value";
        public static final String COLUMN_FLOAT = "float_value";
        public static final String COLUMN_DOUBLE = "double_value";
        public static final String COLUMN_BOOLEAN = "boolean_value";
        public static final String COLUMN_BLOB = "blob_value";
        public static final String COLUMN_ENUM = "enum_value";
    }

    public static class SimpleTable {
        public static final String NAME = "simple_table";

        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_NAME = "name";
    }
}
