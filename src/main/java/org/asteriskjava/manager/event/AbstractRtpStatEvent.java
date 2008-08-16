/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Abstract base class for RTP statistics events.<p>
 *
 * @author srt
 * @version $Id$
 * @since 1.0.0
 */
public abstract class AbstractRtpStatEvent extends ManagerEvent
{
    private static final long serialVersionUID = 1L;

    private Integer ssrc;
    private Integer lostPackets;
    private Double jitter;

    public AbstractRtpStatEvent(Object source)
    {
        super(source);
    }

    public Integer getSsrc()
    {
        return ssrc;
    }

    public void setSsrc(Integer ssrc)
    {
        this.ssrc = ssrc;
    }

    /**
     * Returns the number of lost packets.
     *
     * @return the number of lost packets.
     */
    public Integer getLostPackets()
    {
        return lostPackets;
    }

    public void setLostPackets(Integer lostPackets)
    {
        this.lostPackets = lostPackets;
    }

    public Double getJitter()
    {
        return jitter;
    }

    public void setJitter(Double jitter)
    {
        this.jitter = jitter;
    }
}