package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(InformationService informationService,
                                 ProductOrderService productOrderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDTO process(final OrderRequest orderRequest) {
        boolean isPurchased = productOrderService.rent(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getTotalCost());

        if (isPurchased) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new ProductOrderDTO(orderRequest.getUser(), true);
        } else {
            return new ProductOrderDTO(orderRequest.getUser(), false);
        }

    }

}
