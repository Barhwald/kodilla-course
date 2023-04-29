package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private final InformationService informationService;
    private final ProductOrderService productOrderService;
    private final OrderRepository orderRepository;

    public ProductOrderProcessor(InformationService informationService,
                                 ProductOrderService productOrderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDTO process(final OrderRequest orderRequest) {
        boolean isPurchased = productOrderService.purchase(orderRequest.getUser(), orderRequest.getProduct(),
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
