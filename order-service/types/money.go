package types

import (
    "math"
    "strconv"
)

type Money struct {
	amount int64
}

func (m Money) ToString() string {
    withDecimals := float64(m.amount) / 100
    return strconv.FormatFloat(withDecimals, 'f', 2, 64)
}

func (m Money) ToFloat64() float64 {
	return float64(m.amount) / 100
}

func NewMoneyFromFloat(amount float64) Money {
    cents := int64(math.Round(amount * 100))
    return Money{amount: cents}
}

func NewMoneyFromInt(amount int64) Money {
    return Money{amount: amount}
}