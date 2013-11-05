package org.computerscience.egillespie.builder;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.sun.istack.internal.Nullable;

public class Name {
    private final String first;
    private final String middle;
    private final String last;

    public Name(String first, @Nullable String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public Optional<String> getMiddle() {
        return Optional.fromNullable(middle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String first;
        private String middle;
        private String last;

        public Builder setFirst(String first) {
            this.first = first;
            return this;
        }

        public Builder setMiddle(String middle) {
            this.middle = middle;
            return this;
        }

        public Builder setLast(String last) {
            this.last = last;
            return this;
        }


        public Name build() {
            return new Name(first,
                    middle,
                    last);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name that = (Name) o;
        return Objects.equal(this.first, that.first)
                && Objects.equal(this.middle, that.middle)
                && Objects.equal(this.last, that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
                first,
                middle,
                last);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("first", first)
                .add("middle", middle)
                .add("last", last)
                .toString();
    }
}
