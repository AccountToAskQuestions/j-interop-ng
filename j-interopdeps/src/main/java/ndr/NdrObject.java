/* Donated by Jarapac (http://jarapac.sourceforge.net/)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110, USA
 */
package ndr;

public abstract class NdrObject {

    static final int opnum = -1;
    public Object value;

    public int getOpnum() {
        return opnum;
    }

    public void encode(NetworkDataRepresentation ndr, NdrBuffer dst) throws NdrException {
        ndr.buf = dst;
        write(ndr);
        /* just for compatibility with jarapac < 0.2 */
    }

    public void decode(NetworkDataRepresentation ndr, NdrBuffer src) throws NdrException {
        ndr.buf = src;
        read(ndr);
    }

    public void write(NetworkDataRepresentation ndr) {
    }

    public void read(NetworkDataRepresentation ndr) {
    }
}
