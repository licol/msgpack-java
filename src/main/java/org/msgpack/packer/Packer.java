//
// MessagePack for Java
//
// Copyright (C) 2009-2011 FURUHASHI Sadayuki
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.
//
package org.msgpack.packer;

import java.math.BigInteger;
import java.io.IOException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import org.msgpack.type.Value;

/**
 * Standard serializer in MessagePack for Java. It allows users to serialize
 * objects like <tt>String</tt>, <tt>List</tt>, <tt>Map</tt>, <tt>byte[]</tt>,
 * primitive types and so on.
 *
 * @version 0.6.0
 */
public interface Packer extends Closeable {
    public void writeNil() throws IOException;

    public void writeBoolean(boolean v) throws IOException;

    public void writeByte(byte v) throws IOException;

    public void writeShort(short v) throws IOException;

    public void writeInt(int v) throws IOException;

    public void writeLong(long v) throws IOException;

    public void writeBigInteger(BigInteger v) throws IOException;

    public void writeFloat(float v) throws IOException;

    public void writeDouble(double v) throws IOException;

    public void writeByteArray(byte[] b) throws IOException;

    public void writeByteArray(byte[] b, int off, int len) throws IOException;

    public void writeByteBuffer(ByteBuffer bb) throws IOException;

    public void writeString(String s) throws IOException;


    public void writeArrayBegin(int size) throws IOException;

    public void writeArrayEnd(boolean check) throws IOException;

    public void writeArrayEnd() throws IOException;

    public void writeMapBegin(int size) throws IOException;

    public void writeMapEnd(boolean check) throws IOException;

    public void writeMapEnd() throws IOException;


    public Packer write(Object o) throws IOException;

    public Packer write(Value v) throws IOException;
}

