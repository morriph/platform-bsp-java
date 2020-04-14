/*
 * Copyright (C) 2020 Reactive Markets Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.reactivemarkets.platform.ws;

import com.reactivemarkets.encoding.feed.Feed;

public class FeedRequestParameters {

    /**
     * Unique identifier of this request to be referenced on Feed Gateway responses.
     */
    private final String requestId;
    /**
     * List of markets to subscribe to in the form <instrument>-<venue>. E.g.
     * BTCUSD-CNB
     */
    private final String[] markets;
    /**
     * Type of feed for the subscription. Currently only default supported.
     */
    private Short feedType = Feed.Default;
    /**
     * Depth of the order book. Top of Book = 1.
     */
    private Short depth = 10;
    /**
     * Conflation time of order book updates in milliseconds.
     */
    private int conflation = 1000;
    /**
     * Grouping of order book updates in price ticks. E.g. for BTCUSD at 6501.37, 1
     * would be 6501.37, 10 would be 6501.4, 50 would be 6503.5
     */
    private int grouping = 1;

    public FeedRequestParameters(final String requestId, final String... markets) {
        super();
        this.requestId = requestId;
        this.markets = markets;
    }

    public FeedRequestParameters setFeedType(final Short feedType) {
        this.feedType = feedType;
        return this;
    }

    public FeedRequestParameters setDepth(final Short depth) {
        this.depth = depth;
        return this;
    }

    public FeedRequestParameters setConflation(final int conflation) {
        this.conflation = conflation;
        return this;
    }

    public FeedRequestParameters setGrouping(final int grouping) {
        this.grouping = grouping;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public String[] getMarkets() {
        return markets;
    }

    public Short getFeedType() {
        return feedType;
    }

    public Short getDepth() {
        return depth;
    }

    public int getConflation() {
        return conflation;
    }

    public int getGrouping() {
        return grouping;
    }
}